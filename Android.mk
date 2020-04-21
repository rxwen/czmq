# Copyright (C) 2008 The Android Open Source Project
#
# Licensed under the Apache License, Version 2.0 (the "License");
# you may not use this file except in compliance with the License.
# You may obtain a copy of the License at
#
#      http://www.apache.org/licenses/LICENSE-2.0
#
# Unless required by applicable law or agreed to in writing, software
# distributed under the License is distributed on an "AS IS" BASIS,
# WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
# See the License for the specific language governing permissions and
# limitations under the License.

LOCAL_PATH := $(call my-dir)

include $(CLEAR_VARS)
LOCAL_MODULE_TAGS := eng
LOCAL_C_INCLUDES := $(LOCAL_PATH)/include/ \
					$(LOCAL_PATH)/builds/android/ \
					$(LOCAL_PATH)/builds/mingw32/ \
					external/zeromq/include

LOCAL_CFLAGS := -D CZMQ_BUILD_DRAFT_API

LOCAL_SRC_FILES := \
	./src/zmsg.c \
	./src/zdigest.c \
	./src/zloop.c \
	./src/zarmour.c \
	./src/zhttp_server.c \
	./src/zbeacon.c \
	./src/zgossip_msg.c \
	./src/zsys.c \
	./src/zargs.c \
	./src/zmonitor.c \
	./src/zuuid.c \
	./src/zhash.c \
	./src/zactor.c \
	./src/zlistx.c \
	./src/zhttp_client.c \
	./src/ztimerset.c \
	./src/zlist.c \
	./src/zauth.c \
	./src/zrex.c \
	./src/zcertstore.c \
	./src/ztrie.c \
	./src/zpoller.c \
	./src/zclock.c \
	./src/zchunk.c \
	./src/zstr.c \
	./src/zproxy.c \
	./src/zdir_patch.c \
	./src/zgossip.c \
	./src/zframe.c \
	./src/zhashx.c \
	./src/zsock.c \
	./src/zhttp_request.c \
	./src/zfile.c \
	./src/ziflist.c \
	./src/zproc.c \
	./src/zhttp_response.c \
	./src/zcert.c \
	./src/zdir.c \
	./src/zhttp_server_options.c \
	./src/zconfig.c
	#./src/zsp.c \
	#./src/zmakecert.c \

LOCAL_LDLIBS += -lpthread

LOCAL_SHARED_LIBRARIES := libzeromq liblog
#HEADERS := include/zmq.h \
	#include/zmq_utils.h

#LOCAL_COPY_HEADERS := $(HEADERS)

LOCAL_MODULE := libczmq
include $(BUILD_SHARED_LIBRARY)
