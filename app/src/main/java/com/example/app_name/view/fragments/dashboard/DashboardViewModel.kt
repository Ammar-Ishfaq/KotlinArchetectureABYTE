package com.example.app_name.view.fragments.dashboard

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.example.app_name.api.SharedWebService
import com.example.app_name.extensions.wrapWithEvent
import com.example.app_name.models.responseModels.DatumListResponse
import com.example.app_name.util.Event
import com.example.app_name.util.AppUtils
import com.example.app_name.viewmodel.BaseViewModel
import kotlinx.coroutines.launch

class DashboardViewModel constructor(
    private val sharedWebService: SharedWebService,
) : BaseViewModel() {

    private val _text = MutableLiveData<Event<String>>().apply {
        value = "This is dashboard Fragment".wrapWithEvent()
    }
    val text: LiveData<Event<String>> = _text

    var mDatum: MutableLiveData<DatumListResponse> = MutableLiveData()

    fun getAllUserList() {
        viewModelScope.launch {

            _showHideProgressDialog.value = true.wrapWithEvent()

            sharedWebService.getAllUserList().run {

                onSuccess {
                    _showHideProgressDialog.value = false.wrapWithEvent()

                    if (it.Status == VALID_STATUS_CODE) {
                        mDatum.value = it
                        _text.postValue("DashBoard Fragment SUCCES After Getting api Data".wrapWithEvent())

                    } else if (it.Status == 500) {
                        _text.postValue("DashBoard Fragment SERVER ERROR After Getting api Data".wrapWithEvent())

                        showSnackbarMessage(AppUtils.SERVER_NOT_RESPONDING_MESSAGE)

                    } else {
                        mDatum.value = it
                        _text.postValue("DashBoard Fragment UNKNOWN ERROR After Getting api Data".wrapWithEvent())

                    }
                }

                onFailure {
                    _showHideProgressDialog.value = false.wrapWithEvent()
//                    it.message?.let { it1 -> showSnackbarMessage(it1) }
                    showSnackbarMessage(AppUtils.INTERNET_CONNECTION_ERROR_MESSAGE)
                    _text.postValue("DashBoard Fragment Api Failed Data".wrapWithEvent())

                }

            }
        }
    }


}