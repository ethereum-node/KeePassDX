package com.kunzisoft.keepass.education

import android.app.Activity
import android.graphics.Color
import android.view.View
import com.getkeepsafe.taptargetview.TapTarget
import com.getkeepsafe.taptargetview.TapTargetView
import com.kunzisoft.keepass.R

class GroupActivityEducation(activity: Activity)
    : Education(activity) {

    fun checkAndPerformedAddNodeButtonEducation(educationView: View,
                                                onEducationViewClick: ((TapTargetView?) -> Unit)? = null,
                                                onOuterViewClick: ((TapTargetView?) -> Unit)? = null): Boolean {
        return checkAndPerformedEducation(!isEducationNewNodePerformed(activity),
                TapTarget.forView(educationView,
                        activity.getString(R.string.education_new_node_title),
                        activity.getString(R.string.education_new_node_summary))
                        .textColorInt(Color.WHITE)
                        .tintTarget(false)
                        .cancelable(true),
                object : TapTargetView.Listener() {
                    override fun onTargetClick(view: TapTargetView) {
                        super.onTargetClick(view)
                        onEducationViewClick?.invoke(view)
                    }

                    override fun onOuterCircleClick(view: TapTargetView?) {
                        super.onOuterCircleClick(view)
                        view?.dismiss(false)
                        onOuterViewClick?.invoke(view)
                    }
                },
                R.string.education_new_node_key)
    }

    fun checkAndPerformedSearchMenuEducation(educationView: View,
                                             onEducationViewClick: ((TapTargetView?) -> Unit)? = null,
                                             onOuterViewClick: ((TapTargetView?) -> Unit)? = null): Boolean {
        return checkAndPerformedEducation(!isEducationSearchPerformed(activity),
                TapTarget.forView(educationView,
                        activity.getString(R.string.education_search_title),
                        activity.getString(R.string.education_search_summary))
                        .textColorInt(Color.WHITE)
                        .tintTarget(true)
                        .cancelable(true),
                object : TapTargetView.Listener() {
                    override fun onTargetClick(view: TapTargetView) {
                        super.onTargetClick(view)
                        onEducationViewClick?.invoke(view)
                    }

                    override fun onOuterCircleClick(view: TapTargetView?) {
                        super.onOuterCircleClick(view)
                        view?.dismiss(false)
                        onOuterViewClick?.invoke(view)
                    }
                },
                R.string.education_search_key)
    }

    fun checkAndPerformedSortMenuEducation(educationView: View,
                                           onEducationViewClick: ((TapTargetView?) -> Unit)? = null,
                                           onOuterViewClick: ((TapTargetView?) -> Unit)? = null): Boolean {
        return checkAndPerformedEducation(!isEducationSortPerformed(activity),
                TapTarget.forView(educationView,
                        activity.getString(R.string.education_sort_title),
                        activity.getString(R.string.education_sort_summary))
                        .textColorInt(Color.WHITE)
                        .tintTarget(true)
                        .cancelable(true),
                object : TapTargetView.Listener() {
                    override fun onTargetClick(view: TapTargetView) {
                        super.onTargetClick(view)
                        onEducationViewClick?.invoke(view)
                    }

                    override fun onOuterCircleClick(view: TapTargetView?) {
                        super.onOuterCircleClick(view)
                        view?.dismiss(false)
                        onOuterViewClick?.invoke(view)
                    }
                },
                R.string.education_sort_key)
    }

    fun checkAndPerformedLockMenuEducation(educationView: View,
                                           onEducationViewClick: ((TapTargetView?) -> Unit)? = null,
                                           onOuterViewClick: ((TapTargetView?) -> Unit)? = null): Boolean {
        return checkAndPerformedEducation(!isEducationLockPerformed(activity),
                TapTarget.forView(educationView,
                        activity.getString(R.string.education_lock_title),
                        activity.getString(R.string.education_lock_summary))
                        .textColorInt(Color.WHITE)
                        .tintTarget(true)
                        .cancelable(true),
                object : TapTargetView.Listener() {
                    override fun onTargetClick(view: TapTargetView) {
                        super.onTargetClick(view)
                        onEducationViewClick?.invoke(view)
                    }

                    override fun onOuterCircleClick(view: TapTargetView?) {
                        super.onOuterCircleClick(view)
                        view?.dismiss(false)
                        onOuterViewClick?.invoke(view)
                    }
                },
                R.string.education_lock_key)
    }
}