package com.bridgeLabz.objectOriented.stockMarket;

import java.util.ArrayList;

import com.bridgeLabz.objectOriented.stockMarket.model.Share;


 //This class has the functionality of add a new share, remove a share, find a
  //share from the list, print short hand representation of the list, print
 // inDetail data present in the list.

public class CompanyOperation {
	public static ArrayList<Share> companyShareList;

	
	public CompanyOperation() {
		companyShareList = new ArrayList<Share>();
	}


	public ArrayList<Share> getCompanyShareList() {
		return companyShareList;
	}


	public boolean AddShare(Share newShare) {
		if (findShare(newShare.getSymbol()) >= 0) {
			System.out.println("Share already exist.");
			return false;
		}
		companyShareList.add(newShare);
		return true;
	}

	
	private int findShare(String symbol) {
		for (int i = 0; i < companyShareList.size(); i++) {
			Share fetchedShare = companyShareList.get(i);
			if (fetchedShare.getSymbol().equals(symbol)) {
				return i;
			}
		}
		return -1;
	}

	
	public boolean removeShare(Share share) {
		int foundPosition = findShare(share.getSymbol());
		if (foundPosition < 0) {
			System.out.println(share.getSymbol() + " not found.");
			return false;
		}
		companyShareList.remove(foundPosition);
		System.out.println("Share of comapany " + share.getName() + " successfully removed.");
		return true;
	}

	
	public Share SearchShare(String symbol) {
		int position = findShare(symbol);
		if (position >= 0) {
			return companyShareList.get(position);
		}
		return null;
	}


	public void displayShortList() {
		System.out.println("Symbol\t  \tQuantity");
		for (int i = 0; i < companyShareList.size(); i++) {
			Share getShareIndex = companyShareList.get(i);
			System.out.println(getShareIndex.getSymbol() + "\t->\t" + getShareIndex.getQuantity());
		}
	}

	
	public void displayFullList() {
		System.out.println("Symbol\t  \tQuantity");
		for (int i = 0; i < companyShareList.size(); i++) {
			Share getShareIndex = companyShareList.get(i);
			System.out.println("Name : " + getShareIndex.getName() + ", Symbol : " + getShareIndex.getSymbol()
					+ ", price :" + getShareIndex.getPrice() + ", quantity : " + getShareIndex.getQuantity());

		}
	}

}