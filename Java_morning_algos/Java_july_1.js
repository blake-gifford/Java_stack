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

    /*
                      root
                  <-- 25 -->
                /            \
              18             50
            /    \         /    \
          10     22      35     70
        /   \   /  \    /  \   /  \
      4    12      24  31  44 66  90
    */


    // - does it exist?
    // AND
    // - is it the root?
    // AND
    // - does it have one child?
    // - does it have no children?
    // - does it have two?  children?
    // hints:
    //        - you may use helper functions like this.getLargestFromSubtree(curret);
    //        - you may swap values between nodes

    // findAndDelete
    delete(val, current) {
        // if current is undefined, set as root
        if (current === undefined) {
            current = this.root;
        };

        if(!this.find(val, current)) {return false;}

        if(current.val === val && current === this.root) {
            let rNode = this.removeSmallest(current.right);
            rNode.left = current.left;
            rNode.right = current.right;
            this.root = rNode;
            return current;
        }

        if(current.val === val) {
            current = this.getLargestFromSubtree(current.left);
        }

    }


    // Preorder (DFS - Depth First Search)
    // (Root / Parent, Left, Right)
    // 25, 15, 10, 4, 12, 22, 18, 50, 35, 31, 44, 70, 66, 90
    printPreorder(current) {
        if (current === undefined) {
            current = this.root;
        }

        if (current) {
            // read everything, then recurse
            console.log(current.val);
            this.printPreorder(current.left);
            this.printPreorder(current.right);
        }
    }

    // Inorder (DFS)
    // (Left, Root / Parent, Right)
    // 4, 10, 12, 15, 18, 22, 31, 35, 44, 50, 66, 70, 90
    printInorder(current) {
        if (current === undefined) {
            current = this.root;
        }

        if (current) {
            // recurse left, then read, then recurse right
            this.printInorder(current.left);
            console.log(current.val);
            this.printInorder(current.right);
        }
    }

    // Postorder (DFS)
    // (Left, Right, Root / Parent)
    // 4, 12, 10, 18, 22, 15, 31, 44, 35, 66, 90, 70, 50, 25
    printPostorder(current) {
        if (current === undefined) {
            current = this.root;
        }

        if (current) {
            // recurse in both directions, then read
            this.printPostorder(current.left);
            this.printPostorder(current.right);
            console.log(current.val);
        }
    }

    // Levelorder (BFS - Breath first search)
    // Row-by-row left-right top-down
    // 25, 15, 50, 10, 22, 35, 70, 4, 12, 18, 31, 44, 66, 90
    printLevelorder(current) {
        if (current === undefined) {
            current = this.root;
        };

        var queue = []; // "queue"

        if (current) {
            queue.push(current);
        }

        while (queue.length > 0) {
            var dequeuedNode = queue.shift(); // should probably import our actual queue
            console.log(dequeuedNode.val);

            if (dequeuedNode.left) {
                queue.push(dequeuedNode.left);
            }

            if (dequeuedNode.right) {
                queue.push(dequeuedNode.right);
            }
        }
    }


    isEmpty() {
        return this.root === null;
    };

    // recursively return true or false is val exists within the current tree
    // as always if current is undefined, current = this.root
    find(val, current) {
        if (current === undefined) {
            current = this.root;
        }

        // base cases

        // if current is null, return false up the call stack
        if (current == null) {
            return false;
        }

        // because current is certain to be not null, check val vs val
        // if equal, return true up the call stack
        if (current.val === val) {
            return true;
        }

        // otherwise we need to recurse

        // decide on which direction
        if (current.val > val) {
            current = current.left;
        } else {
            current = current.right;
        }

        // recurse now that current is moved, return the result
        return this.find(val, current);
    }

    // remove and return the smallest node of a given tree
    removeSmallest(current) {
        if (current === undefined) {
            current = this.root;
        }

        // first iteration possibly move the root
        if (current.left === null) {
            this.root = current.right;
            current.right = null;
            return current;
        }

        // base case

        // look ahead
        if (current.left && (current.left.left === null)) {
            var smallest = current.left;
            current.left = smallest.right;
            smallest.right = null;
            return smallest;
        }

        // otherwise recurse

        return this.removeSmallest(current.left);
    }

    insert(node, current) {
        // default current to root if no current exists
        if (current === undefined) {
            current = this.root;
        };

        // if empty tree, new node becomes root
        if (current === null) {
            this.root = node;
            return;
        };

        if (current.val > node.val) { // go left
            // check if null and insert
            if (current.left === null) { // <-- base case for inserting left
                current.left = node;
                return;
            } else {
                // otherwise recurse left
                return this.insert(node, current.left); // <-- move current to current.left
            }
        } else if (current.val < node.val) { // go right
            // check if null and insert
            if (current.right === null) { // <-- base case for inserting left
                current.right = node;
                return;
            } else {
                // otherwise recurse right
                return this.insert(node, current.right);
            }
        }
    };

    // recursive
    getLargestFromSubtree(current) {
        // if no tree, tree is root
        if (current === undefined) {
            current = this.root;
        }

        // if tree becomes null, return null
        if (current === null) {
            return null;
        }

        // if there is no further nodes, return tree
        if (current.right === null) {
            return current.val;
        }

        // else recurse to the right and try again
        return this.getLargestFromSubtree(current.right);
    }

    // iterative
    getSmallestFromSubtree() {
        // create runner
        var runner = this.root;

        // return if root is null
        if (!runner) return;

        // loop to the left if it exists
        while (runner.left) {
            runner = runner.left;
        }
        // when the while ends, return runner.val
        return runner.val;
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