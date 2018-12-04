package com.tour.model;

import com.couchbase.client.java.repository.annotation.Field;
import com.couchbase.client.java.repository.annotation.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import java.time.ZonedDateTime;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class BaseModel
{
	@Id
	@NotNull
	private UUID id;

	@NotNull
	@Field("created_by")
	private UUID createdBy;


	@NotNull
	@Field("deleted_by")
	private UUID deletedBy;

	@NotNull
	@Field("updated_by")
	private UUID updatedBy;

	@NotNull
	@Field("created_at")
	private ZonedDateTime createdAt;

	@Field("deleted_at")
	private ZonedDateTime deletedAT;


	@NotNull
	@Field("updated_at")
	private ZonedDateTime updatedAT;
}
