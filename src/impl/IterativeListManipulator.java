package impl;

import java.util.Comparator;

import common.InvalidIndexException;
import common.ListNode;
import interfaces.IListManipulator;
import interfaces.IOperator;
import interfaces.ITransformation;

/**
 * This class represents the iterative implementation of the IListManipulator interface.
 *
 */
public class IterativeListManipulator implements IListManipulator {

    @Override
    public int size(ListNode head) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public boolean contains(ListNode head, Object element) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public int count(ListNode head, Object element) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public String convertToString(ListNode head) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Object getFromFront(ListNode head, int n) throws InvalidIndexException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Object getFromBack(ListNode head, int n) throws InvalidIndexException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public boolean deepEquals(ListNode head1, ListNode head2) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public ListNode deepCopy(ListNode head) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public boolean containsDuplicates(ListNode head) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public ListNode append(ListNode head1, ListNode head2) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public ListNode flatten(ListNode head) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public boolean isCircular(ListNode head) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean containsCycles(ListNode head) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public ListNode sort(ListNode head, Comparator comparator) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public ListNode map(ListNode head, ITransformation transformation) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Object reduce(ListNode head, IOperator operator, Object initial) {
        // TODO Auto-generated method stub
        return null;
    }

}
