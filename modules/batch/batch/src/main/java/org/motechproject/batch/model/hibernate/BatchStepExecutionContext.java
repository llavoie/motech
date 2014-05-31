package org.motechproject.batch.model.hibernate;

// Generated Apr 11, 2014 10:49:43 AM by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * BatchStepExecutionContext generated by hbm2java
 */
@Entity
@Table(name = "batch_step_execution_context", schema = "batch")
public class BatchStepExecutionContext implements java.io.Serializable {

	private long stepExecutionContextId;
	private String shortContext;
	private String serializedContext;
	private String createdBy;
	private String lastUpdatedBy;

	public BatchStepExecutionContext() {
	}

	public BatchStepExecutionContext(long stepExecutionContextId,
			String shortContext) {
		this.stepExecutionContextId = stepExecutionContextId;
		this.shortContext = shortContext;
	}

	public BatchStepExecutionContext(long stepExecutionContextId,
			String shortContext, String serializedContext, String createdBy,
			String lastUpdatedBy) {
		this.stepExecutionContextId = stepExecutionContextId;
		this.shortContext = shortContext;
		this.serializedContext = serializedContext;
		this.createdBy = createdBy;
		this.lastUpdatedBy = lastUpdatedBy;
	}

	@Id
	@Column(name = "step_execution_context_id", unique = true, nullable = false)
	public long getStepExecutionContextId() {
		return this.stepExecutionContextId;
	}

	public void setStepExecutionContextId(long stepExecutionContextId) {
		this.stepExecutionContextId = stepExecutionContextId;
	}

	@Column(name = "short_context", nullable = false, length = 2500)
	public String getShortContext() {
		return this.shortContext;
	}

	public void setShortContext(String shortContext) {
		this.shortContext = shortContext;
	}

	@Column(name = "serialized_context")
	public String getSerializedContext() {
		return this.serializedContext;
	}

	public void setSerializedContext(String serializedContext) {
		this.serializedContext = serializedContext;
	}

	@Column(name = "created_by", length = 15)
	public String getCreatedBy() {
		return this.createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	@Column(name = "last_updated_by", length = 15)
	public String getLastUpdatedBy() {
		return this.lastUpdatedBy;
	}

	public void setLastUpdatedBy(String lastUpdatedBy) {
		this.lastUpdatedBy = lastUpdatedBy;
	}

}