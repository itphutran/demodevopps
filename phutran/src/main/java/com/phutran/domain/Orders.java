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
import javax.persistence.UniqueConstraint;

/**
 * Orders generated by hbm2java
 */
@Entity
@Table(name = "orders", catalog = "meatbox", uniqueConstraints = @UniqueConstraint(columnNames = { "device_id",
		"device_id_index" }))
public class Orders implements java.io.Serializable {

	private Long id;
	private Integer amount;
	private Date createdAt;
	private Date deletedAt;
	private Long deviceId;
	private Long deviceIdIndex;
	private String orderStatus;
	private String payType;
	private Long productId;
	private Integer slotX;
	private Integer slotY;
	private Integer totalMoney;
	private Date updatedAt;
	private int profit;

	public Orders() {
	}

	public Orders(int profit) {
		this.profit = profit;
	}

	public Orders(Integer amount, Date createdAt, Date deletedAt, Long deviceId, Long deviceIdIndex, String orderStatus,
			String payType, Long productId, Integer slotX, Integer slotY, Integer totalMoney, Date updatedAt,
			int profit) {
		this.amount = amount;
		this.createdAt = createdAt;
		this.deletedAt = deletedAt;
		this.deviceId = deviceId;
		this.deviceIdIndex = deviceIdIndex;
		this.orderStatus = orderStatus;
		this.payType = payType;
		this.productId = productId;
		this.slotX = slotX;
		this.slotY = slotY;
		this.totalMoney = totalMoney;
		this.updatedAt = updatedAt;
		this.profit = profit;
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

	@Column(name = "amount")
	public Integer getAmount() {
		return this.amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
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
	@Column(name = "deleted_at", length = 19)
	public Date getDeletedAt() {
		return this.deletedAt;
	}

	public void setDeletedAt(Date deletedAt) {
		this.deletedAt = deletedAt;
	}

	@Column(name = "device_id")
	public Long getDeviceId() {
		return this.deviceId;
	}

	public void setDeviceId(Long deviceId) {
		this.deviceId = deviceId;
	}

	@Column(name = "device_id_index")
	public Long getDeviceIdIndex() {
		return this.deviceIdIndex;
	}

	public void setDeviceIdIndex(Long deviceIdIndex) {
		this.deviceIdIndex = deviceIdIndex;
	}

	@Column(name = "order_status", length = 6)
	public String getOrderStatus() {
		return this.orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	@Column(name = "pay_type", length = 11)
	public String getPayType() {
		return this.payType;
	}

	public void setPayType(String payType) {
		this.payType = payType;
	}

	@Column(name = "product_id")
	public Long getProductId() {
		return this.productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	@Column(name = "slot_x")
	public Integer getSlotX() {
		return this.slotX;
	}

	public void setSlotX(Integer slotX) {
		this.slotX = slotX;
	}

	@Column(name = "slot_y")
	public Integer getSlotY() {
		return this.slotY;
	}

	public void setSlotY(Integer slotY) {
		this.slotY = slotY;
	}

	@Column(name = "total_money")
	public Integer getTotalMoney() {
		return this.totalMoney;
	}

	public void setTotalMoney(Integer totalMoney) {
		this.totalMoney = totalMoney;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "updated_at", length = 19)
	public Date getUpdatedAt() {
		return this.updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	@Column(name = "profit", nullable = false)
	public int getProfit() {
		return this.profit;
	}

	public void setProfit(int profit) {
		this.profit = profit;
	}

}