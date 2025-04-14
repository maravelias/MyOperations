   /*
    * Licensed under the Apache License, Version 2.0 (the "License");
    * you may not use this file except in compliance with the License.
    * You may obtain a copy of the License at
    *
    *      http://www.apache.org/licenses/LICENSE-2.0
    *
    * Unless required by applicable law or agreed to in writing, software
    * distributed under the License is distributed on an "AS IS" BASIS,
    * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    * See the License for the specific language governing permissions and
    * limitations under the License.
    */
   package eu.maravelias.myoperations.entity;

   import java.time.OffsetDateTime;
   import java.util.List;
   import java.util.UUID;

   import io.jmix.core.DeletePolicy;
   import io.jmix.core.annotation.DeletedBy;
   import io.jmix.core.annotation.DeletedDate;
   import io.jmix.core.entity.annotation.JmixGeneratedValue;
   import io.jmix.core.entity.annotation.OnDelete;
   import io.jmix.core.metamodel.annotation.Composition;
   import io.jmix.core.metamodel.annotation.JmixEntity;
   import jakarta.persistence.Column;
   import jakarta.persistence.Entity;
   import jakarta.persistence.Id;
   import jakarta.persistence.Index;
   import jakarta.persistence.OneToMany;
   import jakarta.persistence.OrderBy;
   import jakarta.persistence.Table;
   import jakarta.persistence.Version;
   import jakarta.validation.constraints.Email;
   import jakarta.validation.constraints.NotNull;
   import org.springframework.data.annotation.CreatedBy;
   import org.springframework.data.annotation.CreatedDate;
   import org.springframework.data.annotation.LastModifiedBy;
   import org.springframework.data.annotation.LastModifiedDate;

   @JmixEntity
   @Table(name = "MYOPS_CUSTOMER", indexes = {
       @Index(name = "IDX_MYOPS_CUSTOMER", columnList = "ACTIVE")
   })
   @Entity(name = "myops_Customer")
   public class Customer {
       @JmixGeneratedValue @Column(name = "ID", nullable = false) @Id private UUID id;

       @OnDelete(DeletePolicy.CASCADE) @Composition @OrderBy("lastName DESC") @OneToMany(mappedBy = "customer") private List<Contact> contacts;

       @Column(name = "ZIP") private String zip;

       @Column(name = "ADDRESS") private String address;

       @Column(name = "VAT", length = 20) private String vat;

       @Column(name = "CITY") private String city;

       @NotNull @Column(name = "COMPANY_NAME", nullable = false) private String companyName;

       @Email(message = "{msg://eu.maravelias.myoperations.entity/Customer.email.validation.Email}") @Column(name = "EMAIL") private String email;

       @Column(name = "ACTIVE", nullable = false) @NotNull private Boolean active = false;

       @Column(name = "VERSION", nullable = false) @Version private Integer version;

       @CreatedBy @Column(name = "CREATED_BY") private String createdBy;

       @CreatedDate @Column(name = "CREATED_DATE") private OffsetDateTime createdDate;

       @LastModifiedBy @Column(name = "LAST_MODIFIED_BY") private String lastModifiedBy;

       @LastModifiedDate @Column(name = "LAST_MODIFIED_DATE") private OffsetDateTime lastModifiedDate;

       @DeletedBy @Column(name = "DELETED_BY") private String deletedBy;

       @DeletedDate @Column(name = "DELETED_DATE") private OffsetDateTime deletedDate;

       public List<Contact> getContacts() {return contacts;}

    public void setContacts(List<Contact> contacts) {this.contacts = contacts;}

    public Boolean getActive() {return active;}

    public void setActive(Boolean active) {this.active = active;}

    public String getEmail() {return email;}

    public void setEmail(String email) {this.email = email;}

    public String getCompanyName() {return companyName;}

    public void setCompanyName(String companyName) {this.companyName = companyName;}

    public String getCity() {return city;}

    public void setCity(String city) {this.city = city;}

    public String getVat() {return vat;}

    public void setVat(String vat) {this.vat = vat;}

    public String getAddress() {return address;}

    public void setAddress(String address) {this.address = address;}

    public String getZip() {return zip;}

    public void setZip(String zip) {this.zip = zip;}

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