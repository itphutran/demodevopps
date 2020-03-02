package com.phutran.domain;
// Generated Feb 14, 2020 2:47:55 PM by Hibernate Tools 4.3.5.Final

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * AppVersion generated by hbm2java
 */
@Entity
@Table(name = "app_version", catalog = "meatbox")
public class AppVersion implements java.io.Serializable {

	private Long id;
	private String androidVersion;
	private String androidUrl;
	private Date createdAt;
	private Date updatedAt;
	private Date deletedAt;

	public AppVersion() {
	}

	public AppVersion(String androidVersion, String androidUrl) {
		this.androidVersion = androidVersion;
		this.androidUrl = androidUrl;
	}

	public AppVersion(String androidVersion, String androidUrl, Date createdAt, Date updatedAt, Date deletedAt) {
		this.androidVersion = androidVersion;
		this.androidUrl = androidUrl;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		this.deletedAt = deletedAt;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "id", unique = true, nullable = false)
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Column(name = "android_version", nullable = false, length = 150)
	public String getAndroidVersion() {
		return this.androidVersion;
	}

	public void setAndroidVersion(String androidVersion) {
		this.androidVersion = androidVersion;
	}

	@Column(name = "android_url", nullable = false, length = 150)
	public String getAndroidUrl() {
		return this.androidUrl;
	}

	public void setAndroidUrl(String androidUrl) {
		this.androidUrl = androidUrl;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "created_at", length = 19)
	public Date getCreatedAt() {
		return this.createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "updated_at", length = 19)
	public Date getUpdatedAt() {
		return this.updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "deleted_at", length = 19)
	public Date getDeletedAt() {
		return this.deletedAt;
	}

	public void setDeletedAt(Date deletedAt) {
		this.deletedAt = deletedAt;
	}

}