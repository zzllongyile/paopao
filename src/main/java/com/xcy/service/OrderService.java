package com.xcy.service;

import com.xcy.pojo.*;

public interface OrderService {
    int  submitHelpOrder(HelpOrder helpOrder);

    int payOrder(int oid, int aid);

    int submitHelpBuyOrder(HelpBuyOrder helpBuyOrder);

    int submitHelpPutOrder(HelpPutOrder helpPutOrder);

    int submitHelpGetOrder(HelpGetOrder helpGetOrder);

    int submitHelpLineOrder(HelpLineOrder helpLineOrder);
}
