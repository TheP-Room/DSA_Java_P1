public class BigONotation {
    /*
        Big O Notation - it describes the performance of algorithm
        it helps us determine if a given algorithm is scalable or not as the input
        grows very large

        denoted by O(n)
        all we need is an aproximation of time/cost not the actual

        O(1) - means the operation/algorithm takes a constant time no matter what is the
            size of input . for eg returning first element of an array
        O(n) - means the time/cost of operation/algorithm increases linearly with the
            size of input . for eg loops
            for (int num : numbers) // O(n)
                System.out.println(num);
            System.out.println(); // O(1)
            Here total time/cost is O(1 + n) but we can neglect the constant as
                it do not affect it much, constants can be neglected in cases such as
                O(2n) -> O(n)
                O(2 + n) -> O(n)
                O(n + m) -> O(n)
                here m represent time complexity for any other loop over another array
                in same program, but it can be neglected as it also means that complexity
                increases linearly with size of input
        O(n^2) - means the time/cost increases in quadratic manner . for eg nested loops
            for (int first : numbers) // O(n)
                for (int second : numbers) // O(n)
                    System.out.println(first+" "+second);
                if there is another loop in the program and the complexity looks like
                O(n + n^2) then here also we can neglect the linear n as all we need
                is an aproximation and n^2 will mostly be greater than n itself
                if there is another nested loop then it will raise to power 3

                O(n + n^2) -> O(n^2)
                O(n^3)
        O(logn) - means the time/cost increases in logarithmic manner, in these
            types of cases we reduce the operational unit by half in each operation
            such as in binary search. the algorithm running in logn is more efficient
            and scalable comparing to linear or quadratic
        O(2^n) - means the time/cost increases in exponential manner, it's just opposite
            to logarithmic one and is not scalable at all


        Space Complexity - tells us approximation of space used in algorithm

        if the variable initialized is independent of size of input then it is constant
        O(1)

        if variable initialized is dependent on size of input then it is linear
        O(n)
    */
}