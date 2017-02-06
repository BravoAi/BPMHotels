package com.bravo.management;

/**
 * This class was automatically generated by the data modeler tool.
 */

@javax.persistence.Entity
public class OpLogDTO implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   @javax.persistence.GeneratedValue(strategy = javax.persistence.GenerationType.AUTO, generator = "OPLOGDTO_ID_GENERATOR")
   @javax.persistence.Id
   @javax.persistence.SequenceGenerator(sequenceName = "OPLOGDTO_ID_SEQ", name = "OPLOGDTO_ID_GENERATOR")
   private java.lang.Long id;

   private java.lang.String module;

   private java.lang.String message;

   private java.lang.String initiator;

   private java.lang.Boolean isCritical;

   private java.lang.String action;

   public OpLogDTO()
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

   public java.lang.String getModule()
   {
      return this.module;
   }

   public void setModule(java.lang.String module)
   {
      this.module = module;
   }

   public java.lang.String getMessage()
   {
      return this.message;
   }

   public void setMessage(java.lang.String message)
   {
      this.message = message;
   }

   public java.lang.String getInitiator()
   {
      return this.initiator;
   }

   public void setInitiator(java.lang.String initiator)
   {
      this.initiator = initiator;
   }

   public java.lang.Boolean getIsCritical()
   {
      return this.isCritical;
   }

   public void setIsCritical(java.lang.Boolean isCritical)
   {
      this.isCritical = isCritical;
   }

   public java.lang.String getAction()
   {
      return this.action;
   }

   public void setAction(java.lang.String action)
   {
      this.action = action;
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

   public OpLogDTO(java.lang.Long id, java.lang.String module,
         java.lang.String message, java.lang.String initiator,
         java.lang.Boolean isCritical, java.lang.String action)
   {
      this.id = id;
      this.module = module;
      this.message = message;
      this.initiator = initiator;
      this.isCritical = isCritical;
      this.action = action;
   }

}