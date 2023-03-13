package Interfaces;

public class CocheCRUDImpl implements CocheCRUD{
    @Override
    public void save() {
        System.out.println("void save");
    }

    @Override
    public void findAll() {
        System.out.println("void findAll");
    }

    @Override
    public void delete() {
        System.out.println("void delete");
    }
}
