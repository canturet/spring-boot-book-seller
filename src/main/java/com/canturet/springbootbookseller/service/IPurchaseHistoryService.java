package com.canturet.springbootbookseller.service;

import com.canturet.springbootbookseller.model.PurchaseHistory;
import com.canturet.springbootbookseller.repository.projection.IPurchaseItem;

import java.util.List;

public interface IPurchaseHistoryService
{
    PurchaseHistory savePurchaseHistory(PurchaseHistory purchaseHistory);

    List<IPurchaseItem> findPurchasedItemsOfUser(Long userId);
}
