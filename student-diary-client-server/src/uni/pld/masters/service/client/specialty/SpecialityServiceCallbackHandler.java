
/**
 * SpecialityServiceCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.4  Built on : Dec 28, 2015 (10:03:39 GMT)
 */

    package uni.pld.masters.service.client.specialty;

    /**
     *  SpecialityServiceCallbackHandler Callback class, Users can extend this class and implement
     *  their own receiveResult and receiveError methods.
     */
    public abstract class SpecialityServiceCallbackHandler{



    protected Object clientData;

    /**
    * User can pass in any object that needs to be accessed once the NonBlocking
    * Web service call is finished and appropriate method of this CallBack is called.
    * @param clientData Object mechanism by which the user can pass in user data
    * that will be avilable at the time this callback is called.
    */
    public SpecialityServiceCallbackHandler(Object clientData){
        this.clientData = clientData;
    }

    /**
    * Please use this constructor if you don't want to set any clientData
    */
    public SpecialityServiceCallbackHandler(){
        this.clientData = null;
    }

    /**
     * Get the client data
     */

     public Object getClientData() {
        return clientData;
     }

        
           /**
            * auto generated Axis2 call back method for createSpeciality method
            * override this method for handling normal response from createSpeciality operation
            */
           public void receiveResultcreateSpeciality(
                    uni.pld.masters.service.client.specialty.SpecialityServiceStub.CreateSpecialityResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from createSpeciality operation
           */
            public void receiveErrorcreateSpeciality(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for findSpecialities method
            * override this method for handling normal response from findSpecialities operation
            */
           public void receiveResultfindSpecialities(
                    uni.pld.masters.service.client.specialty.SpecialityServiceStub.FindSpecialitiesResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from findSpecialities operation
           */
            public void receiveErrorfindSpecialities(java.lang.Exception e) {
            }
                


    }
    