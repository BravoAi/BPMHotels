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

   private java.lang.Boolean isCritical;

   private java.lang.Integer standardTime;

   private java.lang.String location;

   private java.lang.Boolean isContactIsGuest;

   private String category;

   private java.lang.String categoryIconUrl;

   private java.lang.String description;

   private java.lang.String status;

   private java.lang.Long parentJobID;

   private java.lang.Long childJobID;

   private java.lang.String division;

   private java.lang.Boolean isLate;

   private java.lang.String guestName;

   private java.lang.String reporterName;

   private java.lang.Boolean isRoom;

   private java.lang.Integer floorNumber;

   private java.lang.Integer roomNumber;

   private java.lang.String incidentName;

   private java.lang.String subCategory;

   private java.lang.String picture;

   private java.lang.Boolean isRoomOutOfOrder;

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

   public java.lang.Boolean getIsContactIsGuest()
   {
      return this.isContactIsGuest;
   }

   public void setIsContactIsGuest(java.lang.Boolean isContactIsGuest)
   {
      this.isContactIsGuest = isContactIsGuest;
   }

   public java.lang.String getCategoryIconUrl()
   {
      return this.categoryIconUrl;
   }

   public void setCategoryIconUrl(java.lang.String categoryIconUrl)
   {
      this.categoryIconUrl = categoryIconUrl;
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

   public java.lang.Long getParentJobID()
   {
      return this.parentJobID;
   }

   public void setParentJobID(java.lang.Long parentJobID)
   {
      this.parentJobID = parentJobID;
   }

   public java.lang.Long getChildJobID()
   {
      return this.childJobID;
   }

   public void setChildJobID(java.lang.Long childJobID)
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

   public String toString()
   {
      try
      {
         com.google.gson.Gson gson = new com.google.gson.Gson();
         String json = gson.toJson(this);
         return json;
      }
      catch (Exception e)
      {
         return e.getMessage();
      }

   }

   private static String getString(java.lang.Object o)
   {
      return o == null ? "null" : o.toString();
   }

   private static String getString(java.lang.String s)
   {

      if (s == null)
      {
         return "null";
      }
      if (s.length() == 0)
      {
         return "empty";
      }
      return s.toString();
   }

   public java.lang.Boolean getIsLate()
   {
      return this.isLate;
   }

   public void setIsLate(java.lang.Boolean isLate)
   {
      this.isLate = isLate;
   }

   public java.lang.String getGuestName()
   {
      return this.guestName;
   }

   public void setGuestName(java.lang.String guestName)
   {
      this.guestName = guestName;
   }

   public java.lang.String getReporterName()
   {
      return this.reporterName;
   }

   public void setReporterName(java.lang.String reporterName)
   {
      this.reporterName = reporterName;
   }

   public java.lang.Boolean getIsRoom()
   {
      return this.isRoom;
   }

   public void setIsRoom(java.lang.Boolean isRoom)
   {
      this.isRoom = isRoom;
   }

   public java.lang.Integer getFloorNumber()
   {
      return this.floorNumber;
   }

   public void setFloorNumber(java.lang.Integer floorNumber)
   {
      this.floorNumber = floorNumber;
   }

   public java.lang.Integer getRoomNumber()
   {
      return this.roomNumber;
   }

   public void setRoomNumber(java.lang.Integer roomNumber)
   {
      this.roomNumber = roomNumber;
   }

   public java.lang.String getIncidentName()
   {
      return this.incidentName;
   }

   public void setIncidentName(java.lang.String incidentName)
   {
      this.incidentName = incidentName;
   }

   public java.lang.String getCategory()
   {
      return this.category;
   }

   public void setCategory(java.lang.String category)
   {
      this.category = category;
   }

   public java.lang.String getSubcategory()
   {
      return this.subCategory;
   }

   public void setSubcategory(java.lang.String subCategory)
   {
      this.subCategory = subCategory;
   }

   public java.lang.String getPicture()
   {
      return this.picture;
   }

   public void setPicture(java.lang.String picture)
   {
      this.picture = picture;
   }

   public java.lang.Boolean getIsRoomOutOfOrder()
   {
      return this.isRoomOutOfOrder;
   }

   public void setIsRoomOutOfOrder(java.lang.Boolean isRoomOutOfOrder)
   {
      this.isRoomOutOfOrder = isRoomOutOfOrder;
   }

   public jobObject(java.lang.Long id, java.lang.String type,
         java.lang.String typeIconUrl, java.lang.Boolean isUrgent,
         java.lang.Boolean urgentIconUrl, com.bravo.management.User assignedTo,
         java.lang.Boolean isCritical, java.lang.Integer standardTime,
         java.lang.String location, java.lang.Boolean isContactIsGuest,
         java.lang.String category, java.lang.String categoryIconUrl,
         java.lang.String description, java.lang.String status,
         java.lang.Long parentJobID, java.lang.Long childJobID,
         java.lang.String division, java.lang.Boolean isLate,
         java.lang.String guestName, java.lang.String reporterName,
         java.lang.Boolean isRoom, java.lang.Integer floorNumber,
         java.lang.Integer roomNumber, java.lang.String incidentName,
         java.lang.String subCategory, java.lang.String picture,
         java.lang.Boolean isRoomOutOfOrder)
   {
      this.id = id;
      this.type = type;
      this.typeIconUrl = typeIconUrl;
      this.isUrgent = isUrgent;
      this.urgentIconUrl = urgentIconUrl;
      this.assignedTo = assignedTo;
      this.isCritical = isCritical;
      this.standardTime = standardTime;
      this.location = location;
      this.isContactIsGuest = isContactIsGuest;
      this.category = category;
      this.categoryIconUrl = categoryIconUrl;
      this.description = description;
      this.status = status;
      this.parentJobID = parentJobID;
      this.childJobID = childJobID;
      this.division = division;
      this.isLate = isLate;
      this.guestName = guestName;
      this.reporterName = reporterName;
      this.isRoom = isRoom;
      this.floorNumber = floorNumber;
      this.roomNumber = roomNumber;
      this.incidentName = incidentName;
      this.subCategory = subCategory;
      this.picture = picture;
      this.isRoomOutOfOrder = isRoomOutOfOrder;
   }
}