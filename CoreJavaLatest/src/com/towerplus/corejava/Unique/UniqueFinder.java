package com.towerplus.corejava.Unique;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.stream.Collectors;

import com.towerplus.corejava.Unique.model.MemberRole;

public class UniqueFinder {
	
	public static void main(String args[]) {
		
		MemberRole m1 = new MemberRole(UUID.randomUUID(),"INHERITED");
		MemberRole m2 = new MemberRole(UUID.randomUUID(),"INHERITED");
		MemberRole m3 = new MemberRole(UUID.randomUUID(),"INHERITED");
		
		MemberRole m4 = new MemberRole(m1.getMemberId(),"INHERITED");
		MemberRole m5 = new MemberRole(m3.getMemberId(),"INHERITED");
		MemberRole m6 = new MemberRole(UUID.randomUUID(),"INHERITED");
		
		List<MemberRole> memberRoleList1 = Arrays.asList(m1,m2,m3); 
		
		List<MemberRole> memberRoleList2 = Arrays.asList(m4,m5,m6);
		
		  Set<UUID> memberIdsList1 = memberRoleList1.stream()
	                .map(MemberRole::getMemberId)
	                .collect(Collectors.toSet());
		
		
		  Set<UUID> memberIdsList2 = memberRoleList2.stream()
	                .map(MemberRole::getMemberId)
	                .collect(Collectors.toSet());
		  
		  //Filter List1
		   List<MemberRole> uniqueToList1 = memberRoleList1.stream()
	                .filter(obj -> !memberIdsList2.contains(obj.getMemberId()))
	                .collect(Collectors.toList());
		   
		   List<MemberRole> uniqueToList2 = memberRoleList2.stream()
	                .filter(obj -> !memberIdsList1.contains(obj.getMemberId()))
	                .collect(Collectors.toList());
		
		   // Final result: unique from both
	        List<MemberRole> finalUnique = new ArrayList<>();
	        finalUnique.addAll(uniqueToList1);
	        finalUnique.addAll(uniqueToList2);

	        // Print result
	        finalUnique.forEach(System.out::println);
		
		
		
	}

}
