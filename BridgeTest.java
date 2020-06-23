package bridge;
public class BridgeTest
{
    public static void main(String[] args)
    {
        Implementor imple=new ConcreteImplementorA();
        Abstraction abs=new RefinedAbstraction(imple);
        abs.Operation();
    }
}
//ʵ�ֻ���ɫ
interface Implementor
{
    public void OperationImpl();
}
//����ʵ�ֻ���ɫ
class ConcreteImplementorA implements Implementor
{
    public void OperationImpl()
    {
        System.out.println("����ʵ�ֻ�(Concrete Implementor)��ɫ������" );
    }
}
//���󻯽�ɫ
abstract class Abstraction
{
   protected Implementor imple;
   protected Abstraction(Implementor imple)
   {
       this.imple=imple;
   }
   public abstract void Operation();   
}
//��չ���󻯽�ɫ
class RefinedAbstraction extends Abstraction
{
   protected RefinedAbstraction(Implementor imple)
   {
       super(imple);
   }
   public void Operation()
   {
       System.out.println("��չ����(Refined Abstraction)��ɫ������" );
       imple.OperationImpl();
   }
}