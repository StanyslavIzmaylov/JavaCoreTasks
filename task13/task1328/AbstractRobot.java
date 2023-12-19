package com.javarush.task.task13.task1328;

public abstract class AbstractRobot implements Attackable,Defensable{

    private static int hitCount;



   public BodyPart attack(){
       BodyPart attackedBodyPart = null;
       hitCount = (int) (Math.random() * 4);

       if (hitCount == 1) {
           attackedBodyPart = BodyPart.ARM;
       } else if (hitCount == 2) {
           attackedBodyPart = BodyPart.HEAD;
       }
       else if (hitCount == 3) {
           attackedBodyPart = BodyPart.CHEST;
       }
       else if (hitCount == 4) {
           hitCount = 0;
           attackedBodyPart = BodyPart.LEG;
       }

       return attackedBodyPart;
   }
    public BodyPart defense() {
        BodyPart defendedBodyPart = null;
        hitCount = (int) (Math.random() * 4);

        if (hitCount == 1) {
            defendedBodyPart = BodyPart.HEAD;
        } else if (hitCount == 2) {
            defendedBodyPart = BodyPart.LEG;
        }
        else if (hitCount == 3) {
            defendedBodyPart = BodyPart.CHEST;
        }
        else if (hitCount == 4) {
            hitCount = 0;
            defendedBodyPart = BodyPart.ARM;
        }

        return defendedBodyPart;
    }

}
