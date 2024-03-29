class TestInherit2 {

    public static void main(String[] arg) {
        
      Parent2 P   = new Parent2();
      Child2 C    = new Child2();
      Stranger2 S = new Stranger2();

      System.out.println("\nMain internal access:\n");

      System.out.println("      I can access pv_public: " + P.pv_public);
      System.out.println("   I can access pv_protected: " + P.pv_protected);
//      System.out.println("  I can access(d) pv_private: " + P.pv_private);
      System.out.println("     I can modify pv_private!");
      P.modify_pv_private();
      System.out.println("  I can access(i) pv_private: " + P.pvPrivate());
      
      System.out.println("\nMain access via Parent methods:\n");

      P.pmPublic();
      P.pmProtected();
//      P.pmPrivate();

      System.out.println("\nMain access via Parent method Access:\n");
      P.Access();
      System.out.println("\nMain access via Child method ParentAccess:\n");
      C.ParentAccess();
      System.out.println("\nMain access via Stranger method ParentAccess:\n");
      S.ParentAccess();

    }  // Of method main

}  // Of class TestInherit

class Parent2 {

    public int pv_public = 1;
    protected int pv_protected = 2;
    private int pv_private = 3;

    public void pmPublic() {
      System.out.println("I can access pmPublic!");
    }  // Of method pmPublic

    protected void pmProtected() {
      System.out.println("I can access pmProtected!");
    }  // Of method pmProtected

    private void pmPrivate() {
      System.out.println("I can access pmPrivate!");
    }  // Of method pmPrivate

    public void modify_pv_private() {
      pv_private = pv_private + 1;
    }  // Of method modify_pv_private

    public int pvPrivate() {
      return(pv_private);
    }  // Of method pvPrivate

    public void Access() {

      System.out.println("      I can access pv_public: " + pv_public);
      System.out.println("   I can access pv_protected: " + pv_protected);
      System.out.println("  I can access(d) pv_private: " + pv_private);
      System.out.println("     I can modify pv_private!");
      modify_pv_private();
      System.out.println("  I can access(i) pv_private: " + pvPrivate());
      
      pmPublic();
      pmProtected();
      pmPrivate();

    }  // Of method Access

}  // Of class Parent

class Child2 extends Parent2 {

    public void ParentAccess() {

      System.out.println("      I can access pv_public: " + pv_public);
      System.out.println("   I can access pv_protected: " + pv_protected);
//      System.out.println("  I can access(d) pv_private: " + pv_private);
      System.out.println("     I can modify pv_private!");
      modify_pv_private();
      System.out.println("  I can access(i) pv_private: " + pvPrivate());
      
      pmPublic();
      pmProtected();
//      pmPrivate();

    }  // Of method ParentAccess

}  // Of class Child

class Stranger2 {
    
    Parent2 P = new Parent2();

    public void ParentAccess() {

      System.out.println("      I can access pv_public: " + P.pv_public);
      System.out.println("   I can access pv_protected: " + P.pv_protected);
//      System.out.println("  I can access(d) pv_private: " + P.pv_private);
      System.out.println("     I can modify pv_private!");
      P.modify_pv_private();
      System.out.println("  I can access(i) pv_private: " + P.pvPrivate());
      
      P.pmPublic();
      P.pmProtected();
//      P.pmPrivate();

    }  // Of method ParentAccess


}  // Of class Stranger
