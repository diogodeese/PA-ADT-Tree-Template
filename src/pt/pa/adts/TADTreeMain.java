/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pt.pa.adts;


import javax.swing.tree.TreeNode;
import java.util.List;

/**
 *
 * @author patricia.macedo
 */
public class TADTreeMain {

    public static void main(String[] args) {

        // For testing purposes
        // TreeLinked<String> otherTree = new TreeLinked<>("Teste");
        //Position<String> otherRoot = otherTree.root();
        // Position<String> posLevel2 = otherTree.insert(otherRoot, "Teste Nível 2");

        // Initializing the tree
        TreeLinked<String> myTree = new TreeLinked<>("Animal");
        Position<String> root = myTree.root();

        // Level 2
        Position<String> posMamifero = myTree.insert(root, "Mamifero");
        Position<String> posAve = myTree.insert(root, "Ave");

        // Level 3 - Mamifero
        myTree.insert(posMamifero, "Cao");
        myTree.insert(posMamifero, "Vaca");
        Position<String> posGato = myTree.insert(posMamifero, "Gato");

        // Level 3 - Ave
        myTree.insert(posAve, "Papagaio");
        Position<String> posAguia = myTree.insert(posAve, "Aguia");

        // Level 4 - Aguia
        Position<String> posAguiaReal = myTree.insert(posAguia, "Aguia Real");

        System.out.println(myTree.toString());
        myTree.remove(posAguiaReal);

        System.out.println("Is the node '" + posGato.element() + "' the root? " + myTree.isRoot(posGato));
        System.out.println("Is the node '" + posGato.element() + "' an external node? " + myTree.isExternal(posGato));

        System.out.println("Pre-order: " + myTree.toStringPreOrder());
        System.out.println("Post-order: " + myTree.toStringPosOrder());
    }
}