package com.tour.model;

import com.couchbase.client.java.repository.annotation.Field;
import lombok.*;
import org.springframework.data.couchbase.core.mapping.Document;

import javax.validation.constraints.NotNull;
import java.time.ZonedDateTime;
import java.util.UUID;

@Document
@Data
@NoArgsConstructor
@EqualsAndHashCode
public class User extends BaseModel
{

	@NotNull
	@Field("first_name")
	private String firstName;

	@NotNull
	@Field("last_name")
	private String lastName;

	@Field("email_id")
	private String emailId;

	@NotNull
	@Field("user_name")
	private String userName;

	@NotNull
	@Field("password")
	private String password;

	@Field("date_of_birth")
	private ZonedDateTime dateOfBirth;

	@Field("mobile_number")
	private String mobileNumber;

	@Field("user_type")
	private UserType userType;

	@Builder
	public User(@NotNull UUID id, @NotNull UUID createdBy, @NotNull UUID deletedBy,
	            @NotNull UUID updatedBy, @NotNull ZonedDateTime createdAt, ZonedDateTime deletedAT,
	            @NotNull ZonedDateTime updatedAT, @NotNull String firstName, @NotNull String lastName, String emailId,
	            @NotNull String userName, @NotNull String password, ZonedDateTime dateOfBirth, String mobileNumber)
	{
		super(id, createdBy, deletedBy, updatedBy, createdAt, deletedAT, updatedAT);
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailId = emailId;
		this.userName = userName;
		this.password = password;
		this.dateOfBirth = dateOfBirth;
		this.mobileNumber = mobileNumber;
	}
}
