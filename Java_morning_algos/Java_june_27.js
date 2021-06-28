// https://www.cs.usfca.edu/~galles/visualization/BST.html
// http://btv.melezinek.cz/binary-search-tree.html

class BSTNode {
    constructor(val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
};

class BST {
    constructor() {
        this.root = null;
    }

    isEmpty() {
        return this.root === null;
    };

    insert(node, current) {
        if(this.root === null){
            this.root = node;
        }
        if(current === undefined){
            current = this.root;
        }

        if(node.val < current.val){
            if(current.prev === null){
                current.prev = node;
            }else{
                this.insert(node, current.prev);
            }
        }else{
            if(current.next === null){
                current.next = node;
            }else{
                this.insert(node, current.next);
            }
        }
    };

    // iterative
    getSmallestFromSubtree() {
        let runner = this.root;
        while(runner.left != null){
            runner = runner.left;
        }
        console.log(runner.val);
        return runner;
    }



    // recursive
    getLargestFromSubtree(current) {
        if(current === undefined){
            current = this.root;
        }
        if(current.right = null){
            return current;
        }
        this.getLargestFromSubtree(current.right);
    }

};

// Recursion is:
// - function that calls itself
// - and modifies the inputs
// - so that the inputs lead to a 'base case' and end the recursive call

var myBST = new BST();
myBST.insert(new BSTNode(10));
myBST.insert(new BSTNode(5));
myBST.insert(new BSTNode(20));
console.log(myBST.getSmallestFromSubtree()); // 5
console.log(myBST.getLargestFromSubtree()); // 20
