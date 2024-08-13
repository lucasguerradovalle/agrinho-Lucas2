public class Plant {
    private String type;
    private int growthStage;
    private int matureStage;

    public Plant(String type) {
        this.type = type;
        this.growthStage = 0;
        this.matureStage = getMatureStageForType(type);
    }

    public String getType() {
        return type;
    }

    public void water() {
        if (growthStage < matureStage) {
            growthStage++;
        }
    }

    public boolean isMature() {
        return growthStage >= matureStage;
    }

    public int getGrowthStage() {
        return growthStage;
    }

    private int getMatureStageForType(String type) {
        switch (type.toLowerCase()) {
            case "tomato":
                return 3;
            case "corn":
                return 4;
            case "carrot":
                return 2;
            default:
                return 3; // Default growth stage if type is unknown
        }
    }
}
