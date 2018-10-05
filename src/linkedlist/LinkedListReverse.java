package linkedlist;

// 单链表反转
public class LinkedListReverse {



    public static void main(String[] args) {
        Node node = Node.readyNode();
        System.out.println("--------- before revert ");
        Node.print(node);
        System.out.println("--------- after revert ");
//        Node reverseList = reverseListRecursive(node);
        Node reverseList = revertList(node);
        Node.print(reverseList);
    }


    //使用递归
    static Node reverseListRecursive(Node node) {
        if ( node == null || node.next == null) {
            return node;
        }
        //找到最后一个节点
        Node headNode = reverseListRecursive(node.next);
        node.next.next = node;
        node.next = null;
        return headNode;
    }

    //使用遍历
    static Node revertList(Node node) {
        Node previous = null;
        Node current = node;
        Node headNode = null;
        while (current != null) {
            Node nextNode = current.next;
            if (nextNode == null) {
                headNode = current;
            }
            current.next = previous;
            previous = current;
            current = nextNode;
        }
        return headNode;
    }

}
