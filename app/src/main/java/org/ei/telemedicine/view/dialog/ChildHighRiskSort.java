package org.ei.telemedicine.view.dialog;

import org.ei.telemedicine.R;
import org.ei.telemedicine.Context;
import org.ei.telemedicine.view.contract.SmartRegisterClients;

import java.util.Collections;

import static org.ei.telemedicine.view.contract.ChildSmartRegisterClient.HR_COMPARATOR;

public class ChildHighRiskSort implements SortOption {
    @Override
    public String name() {
        return Context.getInstance().getStringResource(R.string.sort_by_child_hr);
    }

    @Override
    public SmartRegisterClients sort(SmartRegisterClients allClients) {
        Collections.sort(allClients, HR_COMPARATOR);
        return allClients;
    }
}
