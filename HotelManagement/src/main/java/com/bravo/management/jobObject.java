package com.bravo.management;

/**
 * This class was automatically generated by the data modeler tool.
 */

@javax.persistence.Entity
public class jobObject implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   @javax.persistence.GeneratedValue(strategy = javax.persistence.GenerationType.AUTO, generator = "JOBOBJECT_ID_GENERATOR")
   @javax.persistence.Id
   @javax.persistence.SequenceGenerator(sequenceName = "JOBOBJECT_ID_SEQ", name = "JOBOBJECT_ID_GENERATOR")
   private java.lang.Long id;

   private java.lang.String type;

   private java.lang.String typeIconUrl;

   private java.lang.Boolean isUrgent;

   private java.lang.Boolean urgentIconUrl;

   @javax.persistence.ManyToOne(cascade = { javax.persistence.CascadeType.ALL }, fetch = javax.persistence.FetchType.EAGER)
   private com.bravo.management.User assignedTo;

   private java.lang.Boolean isResultInRoomClosed;

   private java.lang.Boolean isCritical;

   private java.lang.Integer standardTime;

   private java.lang.String location;

   private java.lang.String contactPersonName;

   private java.lang.Boolean isContactIsGuest;

   @javax.persistence.ManyToOne(cascade = { javax.persistence.CascadeType.ALL }, fetch = javax.persistence.FetchType.EAGER)
   private com.bravo.management.jobCategoryObject category;

   @javax.persistence.ManyToOne(cascade = { javax.persistence.CascadeType.ALL }, fetch = javax.persistence.FetchType.EAGER)
   private com.bravo.management.jobCategoryObject subCategory;

   private java.lang.String categoryIconUrl;

   private java.lang.String title;

   private java.lang.String description;

   private java.lang.String status;

   private java.math.BigInteger parentJobID;

   private java.math.BigInteger childJobID;

   private java.lang.String division;

   public jobObject()
   {
   }

   public java.lang.Long getId()
   {
      return this.id;
   }

   public void setId(java.lang.Long id)
   {
      this.id = id;
   }

   public java.lang.String getType()
   {
      return this.type;
   }

   public void setType(java.lang.String type)
   {
      this.type = type;
   }

   public java.lang.String getTypeIconUrl()
   {
      return this.typeIconUrl;
   }

   public void setTypeIconUrl(java.lang.String typeIconUrl)
   {
      this.typeIconUrl = typeIconUrl;
   }

   public java.lang.Boolean getIsUrgent()
   {
      return this.isUrgent;
   }

   public void setIsUrgent(java.lang.Boolean isUrgent)
   {
      this.isUrgent = isUrgent;
   }

   public java.lang.Boolean getUrgentIconUrl()
   {
      return this.urgentIconUrl;
   }

   public void setUrgentIconUrl(java.lang.Boolean urgentIconUrl)
   {
      this.urgentIconUrl = urgentIconUrl;
   }

   public com.bravo.management.User getAssignedTo()
   {
      return this.assignedTo;
   }

   public void setAssignedTo(com.bravo.management.User assignedTo)
   {
      this.assignedTo = assignedTo;
   }

   public java.lang.Boolean getIsResultInRoomClosed()
   {
      return this.isResultInRoomClosed;
   }

   public void setIsResultInRoomClosed(java.lang.Boolean isResultInRoomClosed)
   {
      this.isResultInRoomClosed = isResultInRoomClosed;
   }

   public java.lang.Boolean getIsCritical()
   {
      return this.isCritical;
   }

   public void setIsCritical(java.lang.Boolean isCritical)
   {
      this.isCritical = isCritical;
   }

   public java.lang.Integer getStandardTime()
   {
      return this.standardTime;
   }

   public void setStandardTime(java.lang.Integer standardTime)
   {
      this.standardTime = standardTime;
   }

   public java.lang.String getLocation()
   {
      return this.location;
   }

   public void setLocation(java.lang.String location)
   {
      this.location = location;
   }

   public java.lang.String getContactPersonName()
   {
      return this.contactPersonName;
   }

   public void setContactPersonName(java.lang.String contactPersonName)
   {
      this.contactPersonName = contactPersonName;
   }

   public java.lang.Boolean getIsContactIsGuest()
   {
      return this.isContactIsGuest;
   }

   public void setIsContactIsGuest(java.lang.Boolean isContactIsGuest)
   {
      this.isContactIsGuest = isContactIsGuest;
   }

   public com.bravo.management.jobCategoryObject getCategory()
   {
      return this.category;
   }

   public void setCategory(com.bravo.management.jobCategoryObject category)
   {
      this.category = category;
   }

   public com.bravo.management.jobCategoryObject getSubCategory()
   {
      return this.subCategory;
   }

   public void setSubCategory(
         com.bravo.management.jobCategoryObject subCategory)
   {
      this.subCategory = subCategory;
   }

   public java.lang.String getCategoryIconUrl()
   {
      return this.categoryIconUrl;
   }

   public void setCategoryIconUrl(java.lang.String categoryIconUrl)
   {
      this.categoryIconUrl = categoryIconUrl;
   }

   public java.lang.String getTitle()
   {
      return this.title;
   }

   public void setTitle(java.lang.String title)
   {
      this.title = title;
   }

   public java.lang.String getDescription()
   {
      return this.description;
   }

   public void setDescription(java.lang.String description)
   {
      this.description = description;
   }

   public java.lang.String getStatus()
   {
      return this.status;
   }

   public void setStatus(java.lang.String status)
   {
      this.status = status;
   }

   public java.math.BigInteger getParentJobID()
   {
      return this.parentJobID;
   }

   public void setParentJobID(java.math.BigInteger parentJobID)
   {
      this.parentJobID = parentJobID;
   }

   public java.math.BigInteger getChildJobID()
   {
      return this.childJobID;
   }

   public void setChildJobID(java.math.BigInteger childJobID)
   {
      this.childJobID = childJobID;
   }

   public java.lang.String getDivision()
   {
      return this.division;
   }

   public void setDivision(java.lang.String division)
   {
      this.division = division;
   }

   public jobObject(java.lang.Long id, java.lang.String type,
         java.lang.String typeIconUrl, java.lang.Boolean isUrgent,
         java.lang.Boolean urgentIconUrl, com.bravo.management.User assignedTo,
         java.lang.Boolean isResultInRoomClosed, java.lang.Boolean isCritical,
         java.lang.Integer standardTime, java.lang.String location,
         java.lang.String contactPersonName, java.lang.Boolean isContactIsGuest,
         com.bravo.management.jobCategoryObject category,
         com.bravo.management.jobCategoryObject subCategory,
         java.lang.String categoryIconUrl, java.lang.String title,
         java.lang.String description, java.lang.String status,
         java.math.BigInteger parentJobID, java.math.BigInteger childJobID,
         java.lang.String division)
   {
      this.id = id;
      this.type = type;
      this.typeIconUrl = typeIconUrl;
      this.isUrgent = isUrgent;
      this.urgentIconUrl = urgentIconUrl;
      this.assignedTo = assignedTo;
      this.isResultInRoomClosed = isResultInRoomClosed;
      this.isCritical = isCritical;
      this.standardTime = standardTime;
      this.location = location;
      this.contactPersonName = contactPersonName;
      this.isContactIsGuest = isContactIsGuest;
      this.category = category;
      this.subCategory = subCategory;
      this.categoryIconUrl = categoryIconUrl;
      this.title = title;
      this.description = description;
      this.status = status;
      this.parentJobID = parentJobID;
      this.childJobID = childJobID;
      this.division = division;
   }

    public String toString(){
      String str="location:"+location;
      /*str+="  type:"+ type;
      str+="  isUrgent?:"+ isUrgent;
      str+="  standardTime:"+ standardTime;
      str+="  location:"+ location;
      str+="  contactPersonName:"+ contactPersonName;
      str+="  isContactIsGuest:"+ isContactIsGuest;
      str+="  title:"+ title;
      str+="  description:"+ description;
      str+="  division:"+ division;
      str+="  location:"+ location;
      str+="  status:"+ status;*/
      return str;
   }
}