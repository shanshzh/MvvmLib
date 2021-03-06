package com.yangbw.libtest.module.discover.recommend

import com.library.common.mvvm.BaseListViewModel
import com.yangbw.libtest.api.ApiService

/**
 * @author yangbw
 * @date
 */
class RecommendViewModel : BaseListViewModel<ApiService>() {

    public override fun onStart() {

    }

    fun discoverRecommend(pageNo: Int) {
        launchOnlyResult(
            block = {
                getApiService().discoverRecommend(pageNo)
            }, reTry = {
                discoverRecommend(pageNo)
            },
            pageNo = pageNo
        )
    }
}
