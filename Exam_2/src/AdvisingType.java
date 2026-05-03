abstract class AdvisingType {
   private String advisingType;

   AdvisingType(String advisingType){
       setAdvisingType(advisingType);
   }

    public void setAdvisingType(String advisingType) {
        this.advisingType = advisingType;
    }

    public String getAdvisingType() {
        return advisingType;
    }

    abstract void setAdvisingNumber();
    abstract String getAdvisingNumber();
}
/*
 * * abstract class AdvisingType has the following instance variable:
 * * String advisingType
 * *
 * * There is a single constructor with a single parameter with the advisingType which
 * * Calls setAdvisingType with advisingType as the parameter.
 * *
 * * This class has both a standard mutator and accessor method for advisingType:
 * * There are two abstract methods:
 * * setAdvisingNumber has no parameters and a void return value
 * * getAdvisingNumber which has no parameters and returns a String
 */