//package module.payments.api.model.enums;

import org.springframework.core.convert.converter.Converter;
import org.springframework.core.convert.converter.ConverterFactory;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

//public class StringToEnumConverterFactory implements ConverterFactory<String, Enum<? extends EnumMapperType>> {
//
////    @Override
////    public <T extends Enum<? extends EnumMapperType>> Converter<String, T> getConverter(Class<T> targetType) {
////        if (EnumMapperType.class.isAssignableFrom(targetType)) {
////            return new
////        }
////    }
////
////    private class CodeToEnumConverter<T extends Enum<? extends EnumMapperType>> implements Converter<String, T> {
////        private final Map<Integer, T> map;
////
////        public CodeToEnumConverter(Class<T> targetEnum) {
////            T[] enumConstants = targetEnum.getEnumConstants();
////            map = Arrays.stream(enumConstants)
////                    .collect(Collectors.toMap(enumConstant ->
////                            ((EnumMapperType) enumConstant).getCode(), Function.identity()));
////        }
////    }
//}
