package com.company.animales;

public class Sapo extends Animal{
    public Sapo(int positionInTheVector, String name){
        super.name=name;
        super.positionInTheVector= positionInTheVector;
    }

    @Override
    public int jump(Animal[] vector){
        boolean canJump=canJump(vector);
        boolean canJumpTwo=canJumpTwo(vector);
        if(canJump){
            super.positionInTheVector=super.positionInTheVector-1;
            return -1;
        }
        if(canJumpTwo){
            super.positionInTheVector=super.positionInTheVector-2;
            return -2;
        }
        return 0;
    }

    @Override
    public boolean isSapo() {
        return true;
    }


    @Override
    public boolean canJump(Animal[] vector) {
        return (super.positionInTheVector-1>0&&vector[super.positionInTheVector-1]==null);
    }

    @Override
    public boolean canJumpTwo(Animal[] vector) {
        return (super.positionInTheVector-2>1&&vector[super.positionInTheVector-2]==null);
    }

}
