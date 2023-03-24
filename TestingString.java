class PassingString{
    private String check;

    public PassingString(String check){
        this.check = check;
    }
    public void GetResult(){

        if (check.equalsIgnoreCase("X")) System.out.println("Congrats, You have a baby Girl");
        else if (check.equalsIgnoreCase("Y"))
            System.out.println("Congrats, You have a baby Boy");
        else  System.out.println("Invalid Entry");
        }
    }

 class TestingString {
    public static void main (String[] args){
        PassingString input = new PassingString("X");
        input.GetResult();
    }
}
