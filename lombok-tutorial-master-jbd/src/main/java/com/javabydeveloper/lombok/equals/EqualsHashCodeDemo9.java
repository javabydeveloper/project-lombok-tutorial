package com.javabydeveloper.lombok.equals;

import java.lang.annotation.Native;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NonNull;
import lombok.experimental.NonFinal;

@EqualsAndHashCode(onParam_= @NonNull)
public class EqualsHashCodeDemo9 {
	
	private Long id;
	
}
