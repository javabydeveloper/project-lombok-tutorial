package com.javabydeveloper.lombok.settergetter;

import javax.annotation.processing.Generated;
import javax.management.ConstructorParameters;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.NonFinal;

@Getter
@Setter
@AllArgsConstructor(
		onConstructor_= @ConstructorParameters({"id","email"}))
public class User {

	private Long id;
	
	//@Getter(onMethod=@__(@Deprecated)) -- JDK7
	@Getter(onMethod_= @Deprecated) // JDK8
	@Setter(onParam_ = @NonFinal )
	private String email;
	
	@Getter(onMethod_= {
			@Generated("com.javabydeveloper.lombok.settergetter.User"),
			@Deprecated
			})
	private boolean active;
}
