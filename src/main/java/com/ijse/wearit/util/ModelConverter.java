package com.ijse.wearit.util;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class ModelConverter<T>{

    @Autowired
    ObjectMapper objectMapper;

    public Object convertToModel(T type, Class<T> object){
        Object convertedObject = this.objectMapper.convertValue(type, object);
        return convertedObject;
    }

    public T convertToDTO(Object object,Class<T> type){
        T converted = this.objectMapper.convertValue(object,type);
        return converted;
    }

    public List<T> convertToDTOList(List<Object> objectList, Class<T> type){
        List<T> collect = objectList.stream()
                .map(model -> this.convertToDTO(model,type))
                .collect(Collectors.toList());
        return collect;
    }
}
