/*
 * Copyright 2018 Red Hat, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.jboss.shamrock.weld.runtime.graal;

import java.lang.reflect.Member;

import org.jboss.weld.util.reflection.Formats;

import com.oracle.svm.core.annotate.Substitute;
import com.oracle.svm.core.annotate.TargetClass;

public class Substitutions {

    @TargetClass(Formats.class)
    static final class Target_org_jboss_weld_util_reflection_Formats {


        @Substitute
        public static int getLineNumber(Member member) {
            return 0;
        }
    }
}