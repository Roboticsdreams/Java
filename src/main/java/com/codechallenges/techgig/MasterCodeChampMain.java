package com.codechallenges.techgig;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Stack;

public class MasterCodeChampMain {
	/* 
	Bengaluru Metro (100 Marks)

	Ten years ago, Bengaluru Metro started its operations by opening its first line in Central Bengaluru. The government received enormous response from various sections of the society. People started using Metro services so often that only after 6 months of its launch, all the train coaches were seen filled tightly by the travellers. After 10 year now, Metro expanded to cover almost all the major areas of the city. Today, around six different lines are running in different areas, which are connecting not only Bengaluru, but also other regions close to Bengaluru. Lakhs of people are using Metro service every day and today it has become one of top 10 well known Metro networks from across the globe. To take the momentum forward, government continues to expand the metro network in various localities.

	Metro Planning team found various localities where metro stations can be build and they identified various L localities around Bengaluru.  It is possible to connect any two localities, if there exists a commercial agreement (which will be represented by the line in the images below) between them.

	Commerce agreement between two cities will represent the effective cost needed to join the two Localities.

	The proposed metro route has to met the following requirements:

	It could start in any of the localities, but must visit through each of the locality around the city, and finally it should end in another locality different from the starting locality.
	Each locality can be visited exactly once on a route.
	Every pair of consecutively visited localities on the route has a commercial agreement.
	Every pair of consecutively visited localities on the route has to be connected by a line segment.
	To avoid crashes on route via road, the line segments can not cross itself.  For example, It would not be legal, for example, to construct a route that went from 2 to 6 and from 5 to 1(see sample test case 1 image), since the route would cross itself.                                                  

	You need to write a program that will return the minimum cost required to build the metro route connecting all the localities.


	Input Specifications:
	Input 1: It will be the integer that tells the number of localities L in the city, where  3 <= L <= 1000
	Input 2: It will be the integer that represent the number of commercial agreements, N
	Input 3:  It will be the multi-dimension integer array where:
	First line tells the number of rows
	Second line tells the number of columns
	Next N lines represent a unique commercial agreement between localities. Every line contains three space-separated integers that represent the two localities involved in the agreement and the effective cost to build the network between two localities.
	L1 L2 C
	L1 L2 C
	...

	Output Specifications:
	It will be the integer representing the minimum cost, in which the localities are to be connected through the proposed metro route. Return 0, if proposed metro route is not possible.


	Constraints:
	3 <= L <=1000


	Sample Test Case 1:
	Input
	7
	9
	9
	3
	1 4 30
	5 1 100
	1 7 40
	5 6 60
	2 3 10
	3 4 20
	2 6 200
	4 6 300
	6 7 50

	Output
	210


	Explanation
		1	2	3	4	5	6	7
	1	0	0	0	30	100	0	40
	2	0	0	10	0	0	200	0
	3	0	0	0	20	0	0	0
	4	0	0	0	0	0	300	0
	5	0	0	0	0	0	60	0
	6	0	0	0	0	0	0	50
	7	0	0	0	0	0	0	0

	2 -> [10] ->3
	3 -> [20] ->4
	4 -> [30] ->1
	1 -> [40] ->7
	7 -> [50] ->6
	6 -> [60] ->5

	10+20+30+40+50+60 = 210

	The highlighted route (which starts from 2 and further connects 3,4,1,7,6 and 5) is proposed metro route, which is connecting all the localities at once with minimum cost. It should be noted that the proposed route can also be considered starting from 5 and subsequently connecting 6,7,1,4,3 and 2, incurring the similar cost, as that of the first proposed route. So the minimum cost will be 210. 


	Sample Test Case 2:
	Input
	8
	8
	8
	3
	1 5 20
	1 3 40
	3 5 10
	5 7 5
	1 7 100
	2 6 75
	7 3 70
	4 8 80

	Output
	0

	Explanation
	 	1	2	3	4	5	6	7	8
	1	0	0	40	0	20	0	100	0
	2	0	0	0	0	0	75	0	0
	3	0	0	0	0	10	0	70	0
	4	0	0	0	0	0	0	0	80
	5	0	0	0	0	0	0	5	0
	6	0	0	0	0	0	0	0	0
	7	0	0	0	0	0	0	0	0
	8	0	0	0	0	0	0	0	0


	Actually, there is a route which will cover all the cities but it will cross its own travelled path which is not possible as it violates the 5 requirement. Thus, No proposed metro route is possible, which connects all the localities, so the output will be 0.

	 *
	 */
	 @SuppressWarnings({ "rawtypes", "unchecked" })
	public int bengaluruMetroRoutes(int input1,int input2,int[][] input3)
	    {
	    	int result = 0;
	    	if(3 <= input1  && input1 <= 1000) {
				Map<Integer, LinkedHashSet<Integer>> graph = new HashMap<Integer, LinkedHashSet<Integer>>();
				Map<String, Integer> distance = new HashMap<String, Integer>();
				ArrayList<Integer> listGroupCode = new ArrayList<Integer>();
				List<ArrayList<Integer>> paths = new ArrayList<ArrayList<Integer>>();
		
				for (int i = 0; i < input3.length; i++) {
					Integer node1 = input3[i][0];
					Integer node2 = input3[i][1];
					distance.put(node1 + "#" + node2, input3[i][2]);
					distance.put(node2 + "#" + node1, input3[i][2]);
					LinkedHashSet<Integer> adjacent = graph.get(node1);
					if (adjacent == null) {
						adjacent = new LinkedHashSet<Integer>();
						graph.put(node1, adjacent);
					}
					adjacent.add(node2);
		
					node1 = input3[i][1];
					node2 = input3[i][0];
					adjacent = graph.get(node1);
					if (adjacent == null) {
						adjacent = new LinkedHashSet<Integer>();
						graph.put(node1, adjacent);
					}
					adjacent.add(node2);
					listGroupCode.add(node1);
					listGroupCode.add(node2);
				}
				HashSet<Integer> set = new HashSet<Integer>(listGroupCode);
				ArrayList<Integer> mynodes = new ArrayList<Integer>(set);
		
				for (int i = 0; i < mynodes.size(); i++) {
					for (int j = i + 1; j < mynodes.size(); j++) {
		
						Integer START = mynodes.get(i);
						Integer END = mynodes.get(j);
		
						Integer currentNode = START;
						List<Integer> visited = new ArrayList<Integer>();
						visited.add(START);
						Stack<Integer> stackNode = new Stack<Integer>();
						Stack<List<Integer>> stackVisted = new Stack<List<Integer>>();
						stackNode.push(currentNode);
						stackVisted.push(visited);
		
						while (!stackNode.isEmpty()) {
							currentNode = stackNode.pop();
							visited = stackVisted.pop();
		
							if ((currentNode.equals(END))) {
								paths.add(new ArrayList(Arrays.asList(visited.toArray())));
							} else {
								
								LinkedHashSet<Integer> adjacent = graph.get(currentNode);
								LinkedList<Integer> nodes = adjacent == null ? new LinkedList<Integer>()
										: new LinkedList<Integer>(adjacent);
								for (Integer node : nodes) {
									if (visited.contains(node)) {
										continue;
									}
									List<Integer> temp = new ArrayList<Integer>();
									temp.addAll(visited);
									temp.add(node);
									stackNode.push(node);
									stackVisted.push(temp);
								}
							}
						}
		
					}
				}
		
				int min = Integer.MAX_VALUE;
				for (ArrayList<Integer> path : paths) {
					if (path.size() == mynodes.size()) {
						int node1, node2, total = 0;
						for (int i = 1; i < path.size(); i++) {
							node1 = path.get(i - 1);
							node2 = path.get(i);
							total = total + distance.get(node1 + "#" + node2);
						}
						min = min < total ? min : total;
					}
				}
				result = ((min > 0) && (min != Integer.MAX_VALUE)) ? min : result;
	    	}
			return result;
	    }
}
