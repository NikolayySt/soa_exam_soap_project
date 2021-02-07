/**
 * Specialty.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package uni.pld.masters.model.xsd;

public class Specialty  implements java.io.Serializable {
    private java.lang.String faculty;

    private java.lang.Boolean magisterDegree;

    private java.lang.String name;

    private java.lang.Byte yearsDuration;

    public Specialty() {
    }

    public Specialty(
           java.lang.String faculty,
           java.lang.Boolean magisterDegree,
           java.lang.String name,
           java.lang.Byte yearsDuration) {
           this.faculty = faculty;
           this.magisterDegree = magisterDegree;
           this.name = name;
           this.yearsDuration = yearsDuration;
    }


    /**
     * Gets the faculty value for this Specialty.
     * 
     * @return faculty
     */
    public java.lang.String getFaculty() {
        return faculty;
    }


    /**
     * Sets the faculty value for this Specialty.
     * 
     * @param faculty
     */
    public void setFaculty(java.lang.String faculty) {
        this.faculty = faculty;
    }


    /**
     * Gets the magisterDegree value for this Specialty.
     * 
     * @return magisterDegree
     */
    public java.lang.Boolean getMagisterDegree() {
        return magisterDegree;
    }


    /**
     * Sets the magisterDegree value for this Specialty.
     * 
     * @param magisterDegree
     */
    public void setMagisterDegree(java.lang.Boolean magisterDegree) {
        this.magisterDegree = magisterDegree;
    }


    /**
     * Gets the name value for this Specialty.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Specialty.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the yearsDuration value for this Specialty.
     * 
     * @return yearsDuration
     */
    public java.lang.Byte getYearsDuration() {
        return yearsDuration;
    }


    /**
     * Sets the yearsDuration value for this Specialty.
     * 
     * @param yearsDuration
     */
    public void setYearsDuration(java.lang.Byte yearsDuration) {
        this.yearsDuration = yearsDuration;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Specialty)) return false;
        Specialty other = (Specialty) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.faculty==null && other.getFaculty()==null) || 
             (this.faculty!=null &&
              this.faculty.equals(other.getFaculty()))) &&
            ((this.magisterDegree==null && other.getMagisterDegree()==null) || 
             (this.magisterDegree!=null &&
              this.magisterDegree.equals(other.getMagisterDegree()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.yearsDuration==null && other.getYearsDuration()==null) || 
             (this.yearsDuration!=null &&
              this.yearsDuration.equals(other.getYearsDuration())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getFaculty() != null) {
            _hashCode += getFaculty().hashCode();
        }
        if (getMagisterDegree() != null) {
            _hashCode += getMagisterDegree().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getYearsDuration() != null) {
            _hashCode += getYearsDuration().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Specialty.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://model.masters.pld.uni/xsd", "Specialty"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("faculty");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.masters.pld.uni/xsd", "faculty"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("magisterDegree");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.masters.pld.uni/xsd", "magisterDegree"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.masters.pld.uni/xsd", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("yearsDuration");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.masters.pld.uni/xsd", "yearsDuration"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "byte"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
