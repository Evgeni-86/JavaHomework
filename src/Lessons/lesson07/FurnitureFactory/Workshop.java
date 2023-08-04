package Lessons.lesson07.FurnitureFactory;

public abstract class Workshop {

    public static boolean BestCarpenterEver(Furniture obj) {
        obj.infoFurniture(); //восходящее преобразование
        if(obj instanceof Chair) {
            ((Chair) obj).infoChair(); //нисходящее преобразование
            return true;
        }
        return false;
    }
}
