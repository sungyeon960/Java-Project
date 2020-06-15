package java200610;

import java.util.Objects;

public class Member {
	public String name;
	public int age;
	public Member(String name, int age) {
		this.name = name;
		this.age = age;
	}
	@Override
	public int hashCode() {
		return Objects.hash(age, name);
	}
	/*
	 @Override
	 public int hashCode(){
	 	retrun name.hashCode()+age;
	 }
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Member)) {
			return false;
		}
		Member other = (Member) obj;
		return age == other.age && Objects.equals(name, other.name);
	}
	/*
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Member) {
			Member member = (Member) obj;
			return member.name.equals(name) && (member.age==age);
		}
		else {
			return false;
		}
	} 
	*/
}
