package builder;

public class InginerAuto {
    private Builder builder;

    public InginerAuto(String builderType) throws Exception {
        if(builderType=="autoturism"){
            builder = new AutoturismBuilder();
        }else if(builderType=="camion"){
            builder = new CamionBuilder();
        }else{
            throw new Exception("Invalid type for builder");
        }
    }

    public void buildAutomobil(){
        builder.buildSasiu();
        builder.buildMotor();
    }

    public Automobil getAutomobil(){
        return builder.getAutomobil();
    }
}
