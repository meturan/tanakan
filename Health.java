class Health {
    public double height, weight;

    //課題3
    //身長と体重のデータの更新
    public void update(double height, double weight) {
        this.height = height;
        this.weight = weight;
    }

    //課題3
    //BMIの計算結果を返す
    public double bmi() {
        double bmi = this.weight / this.height / this.height;
        return bmi;
    }

    //課題3
    //BMIが標準値であればtrue,標準値でなければfalseを返す
    public boolean isHealthy(double bmi) {
        if(18.5<=bmi&&bmi<25.0){
            return true;
        }else{
            return false;
        }
    }
}