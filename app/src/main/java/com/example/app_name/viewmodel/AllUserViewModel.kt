package com.example.app_name.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.example.app_name.api.SharedWebService
import com.example.app_name.extensions.wrapWithEvent
import com.example.app_name.models.responseModels.DatumListResponse
import com.example.app_name.util.AppUtils
import kotlinx.coroutines.launch

class AllUserViewModel constructor(
    private val sharedWebService: SharedWebService,
) : BaseViewModel() {
    companion object {
        private const val VALID_STATUS_CODE = 200
    }

    var mDatum: MutableLiveData<DatumListResponse> = MutableLiveData()

    /**
     * hit the api
     */
    fun getAllUserList() {
        viewModelScope.launch {

            _showHideProgressDialog.value = true.wrapWithEvent()

            sharedWebService.getAllUserList().run {

                onSuccess {

                    _showHideProgressDialog.value = false.wrapWithEvent()

                    if (it.Status == VALID_STATUS_CODE) {

                        mDatum.value = it

                    } else if (it.Status == 500) {
                        showSnackbarMessage(AppUtils.SERVER_NOT_RESPONDING_MESSAGE)
                    } else {
                        mDatum.value = it
                    }
                }

                onFailure {
                    _showHideProgressDialog.value = false.wrapWithEvent()
//                    it.message?.let { it1 -> showSnackbarMessage(it1) }
                    showSnackbarMessage(AppUtils.INTERNET_CONNECTION_ERROR_MESSAGE)
                }

            }
        }
    }

}