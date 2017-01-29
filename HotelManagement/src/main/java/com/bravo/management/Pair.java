package com.bravo.management;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Pair implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   private java.lang.String role;
   private java.lang.String interfaceName;

   public Pair()
   {
   }

   public java.lang.String getRole()
   {
      return this.role;
   }

   public void setRole(java.lang.String role)
   {
      this.role = role;
   }

   public java.lang.String getInterfaceName()
   {
      return this.interfaceName;
   }

   public void setInterfaceName(java.lang.String interfaceName)
   {
      this.interfaceName = interfaceName;
   }

   public Pair(java.lang.String role, java.lang.String interfaceName)
   {
      this.role = role;
      this.interfaceName = interfaceName;
   }
   
   
   	@Override
	public String toString() {
		return "Pair [role=" + role + ", interfaceName=" + interfaceName + "]";
	}


	

	  public boolean equals(Object o) {
	      return (o instanceof Pair) && (((Pair)o).toString()).equals(this.toString());
	  }

	  public int hashCode() {
	      return toString().hashCode();
	  }
   

}