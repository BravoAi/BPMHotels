package com.bravo.management;

/**
 * This class was automatically generated by the data modeler tool.
 */

@javax.persistence.Entity
public class jobCategoryObject implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   @javax.persistence.GeneratedValue(strategy = javax.persistence.GenerationType.AUTO, generator = "JOBCATEGORYOBJECT_ID_GENERATOR")
   @javax.persistence.Id
   @javax.persistence.SequenceGenerator(sequenceName = "JOBCATEGORYOBJECT_ID_SEQ", name = "JOBCATEGORYOBJECT_ID_GENERATOR")
   private java.lang.Long id;

   private java.lang.String name;

   private java.lang.String iconURL;

   public jobCategoryObject()
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

   public java.lang.String getName()
   {
      return this.name;
   }

   public void setName(java.lang.String name)
   {
      this.name = name;
   }

   public java.lang.String getIconURL()
   {
      return this.iconURL;
   }

   public void setIconURL(java.lang.String iconURL)
   {
      this.iconURL = iconURL;
   }

   public jobCategoryObject(java.lang.Long id, java.lang.String name,
         java.lang.String iconURL)
   {
      this.id = id;
      this.name = name;
      this.iconURL = iconURL;
   }

}