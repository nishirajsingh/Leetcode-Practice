class ParkingSystem {
    int b;
    int m;
    int s;
    public ParkingSystem(int big, int medium, int small) {
        this.b =big;
        this.m = medium;
        this.s= small;
    }
    
    public boolean addCar(int carType) {
        if(1==carType){
            if(b!=0){
                b--;
                return true;
            }else return false;
        }
        if(2==carType){
            if(m!=0){
                m--;
                return true;
            }else return false;
        }
        if(3==carType){
            if(s!=0){
                s--;
                return true;
            }else return false;
        }
        return false;
    }
}

/**
 * Your ParkingSystem object will be instantiated and called as such:
 * ParkingSystem obj = new ParkingSystem(big, medium, small);
 * boolean param_1 = obj.addCar(carType);
 */