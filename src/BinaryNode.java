public class BinaryNode {
    int data;
    BinaryNode left;
    BinaryNode right;
    BinaryNode(int data){
        this.data=data;
    }
    public static void print(BinaryNode root){
        if (root==null){
            return;
        }

       System.out.println(root.data);
//            print(root.left);
//        print(root.right);
    }
    public static void main(String[] args) {
        BinaryNode root = new BinaryNode(10);
        BinaryNode rleft = new BinaryNode(5);
        BinaryNode rright = new BinaryNode(8);
            root.left = rleft;
           root.right = rright;
        System.out.println(root.data);
             print(root.left);
             print(root.right);
    }

    }

