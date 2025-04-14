/*
 *    /*
 *     * Licensed under the Apache License, Version 2.0 (the "License");
 *     * you may not use this file except in compliance with the License.
 *     * You may obtain a copy of the License at
 *     *
 *     *      http://www.apache.org/licenses/LICENSE-2.0
 *     *
 *     * Unless required by applicable law or agreed to in writing, software
 *     * distributed under the License is distributed on an "AS IS" BASIS,
 *     * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *     * See the License for the specific language governing permissions and
 *     * limitations under the License.
 *
 *
 */

package eu.maravelias.myoperations.entity;

import java.time.OffsetDateTime;
import java.util.UUID;

import io.jmix.core.DeletePolicy;
import io.jmix.core.annotation.DeletedBy;
import io.jmix.core.annotation.DeletedDate;
import io.jmix.core.entity.annotation.JmixGeneratedValue;
import io.jmix.core.entity.annotation.OnDeleteInverse;
import io.jmix.core.metamodel.annotation.InstanceName;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.Index;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Version;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

@JmixEntity
@Table(name = "MYOPS_CONTACT", indexes = {
    @Index(name = "IDX_MYOPS_CONTACT_CUSTOMER", columnList = "CUSTOMER_ID")
})
@Entity(name = "myops_Contact")
public class Contact {
    @JmixGeneratedValue @Column(name = "ID", nullable = false) @Id private UUID id;

    @InstanceName @Column(name = "FIRST_NAME") private String firstName;

    @Column(name = "LAST_NAME") private String lastName;

    @Column(name = "JOB_POSITION") private String jobPosition;

    @Column(name = "EMAIL") private String email;

    @Column(name = "PHONE_NUMBER") private String phoneNumber;

    @Column(name = "VERSION", nullable = false) @Version private Integer version;

    @CreatedBy @Column(name = "CREATED_BY") private String createdBy;

    @CreatedDate @Column(name = "CREATED_DATE") private OffsetDateTime createdDate;

    @LastModifiedBy @Column(name = "LAST_MODIFIED_BY") private String lastModifiedBy;

    @LastModifiedDate @Column(name = "LAST_MODIFIED_DATE") private OffsetDateTime lastModifiedDate;

    @DeletedBy @Column(name = "DELETED_BY") private String deletedBy;

    @DeletedDate @Column(name = "DELETED_DATE") private OffsetDateTime deletedDate;

    @OnDeleteInverse(DeletePolicy.CASCADE) @JoinColumn(name = "CUSTOMER_ID", nullable = false) @ManyToOne(fetch = FetchType.LAZY, optional = false) private Customer customer;

    public Customer getCustomer() {return customer;}

    public void setCustomer(Customer customer) {this.customer = customer;}

    public String getJobPosition() {return jobPosition;}

    public void setJobPosition(String jobPosition) {this.jobPosition = jobPosition;}

    public String getPhoneNumber() {return phoneNumber;}

    public void setPhoneNumber(String phoneNumber) {this.phoneNumber = phoneNumber;}

    public String getEmail() {return email;}

    public void setEmail(String email) {this.email = email;}

    public String getLastName() {return lastName;}

    public void setLastName(String lastName) {this.lastName = lastName;}

    public String getFirstName() {return firstName;}

    public void setFirstName(String firstName) {this.firstName = firstName;}

    public OffsetDateTime getDeletedDate() {return deletedDate;}

    public void setDeletedDate(OffsetDateTime deletedDate) {this.deletedDate = deletedDate;}

    public String getDeletedBy() {return deletedBy;}

    public void setDeletedBy(String deletedBy) {this.deletedBy = deletedBy;}

    public OffsetDateTime getLastModifiedDate() {return lastModifiedDate;}

    public void setLastModifiedDate(OffsetDateTime lastModifiedDate) {this.lastModifiedDate = lastModifiedDate;}

    public String getLastModifiedBy() {return lastModifiedBy;}

    public void setLastModifiedBy(String lastModifiedBy) {this.lastModifiedBy = lastModifiedBy;}

    public OffsetDateTime getCreatedDate() {return createdDate;}

    public void setCreatedDate(OffsetDateTime createdDate) {this.createdDate = createdDate;}

    public String getCreatedBy() {return createdBy;}

    public void setCreatedBy(String createdBy) {this.createdBy = createdBy;}

    public Integer getVersion() {return version;}

    public void setVersion(Integer version) {this.version = version;}

    public UUID getId() {return id;}

    public void setId(UUID id) {this.id = id;}

}