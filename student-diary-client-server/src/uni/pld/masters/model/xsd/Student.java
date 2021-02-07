/**
 * Student.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package uni.pld.masters.model.xsd;

public class Student  implements java.io.Serializable {
    private java.lang.String facultyNumber;

    private java.lang.String firstName;

    private java.lang.Long id;

    private java.lang.String lastName;

    private uni.pld.masters.model.xsd.Specialty specialty;

    private uni.pld.masters.model.xsd.University university;

    private java.lang.Byte yearOfStudying;

    public Student() {
    }

    public Student(
           java.lang.String facultyNumber,
           java.lang.String firstName,
           java.lang.Long id,
           java.lang.String lastName,
           uni.pld.masters.model.xsd.Specialty specialty,
           uni.pld.masters.model.xsd.University university,
           java.lang.Byte yearOfStudying) {
           this.facultyNumber = facultyNumber;
           this.firstName = firstName;
           this.id = id;
           this.lastName = lastName;
           this.specialty = specialty;
           this.university = university;
           this.yearOfStudying = yearOfStudying;
    }


    /**
     * Gets the facultyNumber value for this Student.
     * 
     * @return facultyNumber
     */
    public java.lang.String getFacultyNumber() {
        return facultyNumber;
    }


    /**
     * Sets the facultyNumber value for this Student.
     * 
     * @param facultyNumber
     */
    public void setFacultyNumber(java.lang.String facultyNumber) {
        this.facultyNumber = facultyNumber;
    }


    /**
     * Gets the firstName value for this Student.
     * 
     * @return firstName
     */
    public java.lang.String getFirstName() {
        return firstName;
    }


    /**
     * Sets the firstName value for this Student.
     * 
     * @param firstName
     */
    public void setFirstName(java.lang.String firstName) {
        this.firstName = firstName;
    }


    /**
     * Gets the id value for this Student.
     * 
     * @return id
     */
    public java.lang.Long getId() {
        return id;
    }


    /**
     * Sets the id value for this Student.
     * 
     * @param id
     */
    public void setId(java.lang.Long id) {
        this.id = id;
    }


    /**
     * Gets the lastName value for this Student.
     * 
     * @return lastName
     */
    public java.lang.String getLastName() {
        return lastName;
    }


    /**
     * Sets the lastName value for this Student.
     * 
     * @param lastName
     */
    public void setLastName(java.lang.String lastName) {
        this.lastName = lastName;
    }


    /**
     * Gets the specialty value for this Student.
     * 
     * @return specialty
     */
    public uni.pld.masters.model.xsd.Specialty getSpecialty() {
        return specialty;
    }


    /**
     * Sets the specialty value for this Student.
     * 
     * @param specialty
     */
    public void setSpecialty(uni.pld.masters.model.xsd.Specialty specialty) {
        this.specialty = specialty;
    }


    /**
     * Gets the university value for this Student.
     * 
     * @return university
     */
    public uni.pld.masters.model.xsd.University getUniversity() {
        return university;
    }


    /**
     * Sets the university value for this Student.
     * 
     * @param university
     */
    public void setUniversity(uni.pld.masters.model.xsd.University university) {
        this.university = university;
    }


    /**
     * Gets the yearOfStudying value for this Student.
     * 
     * @return yearOfStudying
     */
    public java.lang.Byte getYearOfStudying() {
        return yearOfStudying;
    }


    /**
     * Sets the yearOfStudying value for this Student.
     * 
     * @param yearOfStudying
     */
    public void setYearOfStudying(java.lang.Byte yearOfStudying) {
        this.yearOfStudying = yearOfStudying;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Student)) return false;
        Student other = (Student) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.facultyNumber==null && other.getFacultyNumber()==null) || 
             (this.facultyNumber!=null &&
              this.facultyNumber.equals(other.getFacultyNumber()))) &&
            ((this.firstName==null && other.getFirstName()==null) || 
             (this.firstName!=null &&
              this.firstName.equals(other.getFirstName()))) &&
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.lastName==null && other.getLastName()==null) || 
             (this.lastName!=null &&
              this.lastName.equals(other.getLastName()))) &&
            ((this.specialty==null && other.getSpecialty()==null) || 
             (this.specialty!=null &&
              this.specialty.equals(other.getSpecialty()))) &&
            ((this.university==null && other.getUniversity()==null) || 
             (this.university!=null &&
              this.university.equals(other.getUniversity()))) &&
            ((this.yearOfStudying==null && other.getYearOfStudying()==null) || 
             (this.yearOfStudying!=null &&
              this.yearOfStudying.equals(other.getYearOfStudying())));
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
        if (getFacultyNumber() != null) {
            _hashCode += getFacultyNumber().hashCode();
        }
        if (getFirstName() != null) {
            _hashCode += getFirstName().hashCode();
        }
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getLastName() != null) {
            _hashCode += getLastName().hashCode();
        }
        if (getSpecialty() != null) {
            _hashCode += getSpecialty().hashCode();
        }
        if (getUniversity() != null) {
            _hashCode += getUniversity().hashCode();
        }
        if (getYearOfStudying() != null) {
            _hashCode += getYearOfStudying().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Student.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://model.masters.pld.uni/xsd", "Student"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("facultyNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.masters.pld.uni/xsd", "facultyNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("firstName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.masters.pld.uni/xsd", "firstName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.masters.pld.uni/xsd", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.masters.pld.uni/xsd", "lastName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("specialty");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.masters.pld.uni/xsd", "specialty"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://model.masters.pld.uni/xsd", "Specialty"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("university");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.masters.pld.uni/xsd", "university"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://model.masters.pld.uni/xsd", "University"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("yearOfStudying");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.masters.pld.uni/xsd", "yearOfStudying"));
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
