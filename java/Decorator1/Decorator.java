package Decorator1;

public abstract class Decorator extends BaseService{
    // наследуется от класса BaseService! Это необходимо для согласования типов – декораторы должны относиться к тому же типу, что и декорируемые объекты.
    public abstract String getNameService(); //для перечисления дополнительных услуг
    }

