package com.edubbridge.hibapp1.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "customer001")
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Integer customerId;
		private String customerName;
		private Long customerMobile;
		
		@OneToOne(cascade = CascadeType.ALL)
		private Address customerAddress;
		
		public Integer getCustomerId() {
			return customerId;
		}
		public void setCustomerId(Integer customerId) {
			this.customerId = customerId;
		}
		public String getCustomerName() {
			return customerName;
		}
		public void setCustomerName(String customerName) {
			this.customerName = customerName;
		}
		public Long getCustomerMobile() {
			return customerMobile;
		}
		public void setCustomerMobile(Long customerMobile) {
			this.customerMobile = customerMobile;
		}
		public Address getCustomerAddress() {
			return customerAddress;
		}
		public void setCustomerAddress(Address customerAddress) {
			this.customerAddress = customerAddress;
		}
		@Override
		public String toString() {
			return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", customerMobile="
					+ customerMobile + ", customerAddress=" + customerAddress + "]";
		}	
}
