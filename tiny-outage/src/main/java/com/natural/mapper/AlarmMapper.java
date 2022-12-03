package com.natural.mapper;

import com.natural.model.Alarm;
import com.natural.wrapper.AlarmWrapper;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Mapper(componentModel = "spring")
public interface AlarmMapper {

    AlarmMapper INSTANCE = Mappers.getMapper(AlarmMapper.class);

    Alarm toAlarmWrapper(AlarmWrapper alarmWrapper);

    AlarmWrapper toWrapper(Alarm alarm);

    default List<AlarmWrapper> toWrapperList(List<Alarm> alarmsList) {
        if (alarmsList == null) {
            return new ArrayList<>();
        }
        return alarmsList.stream().map(this::toWrapper).collect(Collectors.toList());
    }
}
